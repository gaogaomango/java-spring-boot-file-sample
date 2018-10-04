package com.example.file.form;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MyUploadForm {
	
	private String description;
	
	private MultipartFile[] fileDatas;

}
