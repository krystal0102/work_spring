package com.koitt.board.service;

import java.io.File;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.koitt.board.model.Board;
import com.koitt.board.model.FileException;

@Service
public class FileServiceImpl implements FileService {

	private static final String UPLOAD_FOLDER = "/upload";

	@Override
	public void add(HttpServletRequest request, MultipartFile attachement, Board board) throws FileException {

		try {
			// 최상위 경로 밑에 upload 폴더 경로를 가져온다
			String path = request.getServletContext().getRealPath(UPLOAD_FOLDER);

			// MultipartFile 객체에서 파일명을 가져온다
			String originalName = attachement.getOriginalFilename();

			// upload 폴더가 없다면, upload 폴더 생성
			File directory = new File(path);
			if (!directory.exists()) {
				directory.mkdir();
			}

			// attachement 객체를 이용하여, 파일을 서버에 전송
			if (attachement != null && !attachement.isEmpty()) {
				Integer idx = originalName.lastIndexOf(".");
				String name = originalName.substring(0, idx);
				String ext = originalName.substring(idx, originalName.length());
				String uploadFilename = name + Long.toHexString(System.currentTimeMillis()) + ext;

				attachement.transferTo(new File(path, uploadFilename));

				uploadFilename = URLEncoder.encode(uploadFilename, "UTF-8");

				board.setAttachement(uploadFilename);	
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new FileException(e.getMessage());
		}
	}

	@Override
	public void remove(HttpServletRequest request, String filename) {

	}

}
