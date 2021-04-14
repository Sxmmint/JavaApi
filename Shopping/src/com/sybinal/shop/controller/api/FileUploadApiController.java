package com.sybinal.shop.controller.api;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/file")
public class FileUploadApiController {
	
	
	@RequestMapping(value="/upload",method=RequestMethod.POST)
	public Map<String, String> Upload(@RequestParam("file")List<MultipartFile> files,HttpServletRequest req,HttpServletResponse rep) throws FileUploadException, IOException {
		//创建文件名称
		String uuid=UUID.randomUUID().toString().replace("-", "");
		
		//获取文件保存路径
		String path=req.getServletContext().getRealPath("/resources/side/images/");
		
		//创建返回对象
		Map<String, String> map=new HashMap<String,String>();
		//定义文件输出流
		FileOutputStream output=null;
		//开始
		try {
			//判断文件是否存在（不为空）
			if(files!=null&&files.size()>0){
				//遍历文件
				for (MultipartFile file : files) {
					//获取文件后缀名
					String fileType=file.getOriginalFilename().split("\\.")[1];
					//file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")+1, file.getOriginalFilename().length());
					//判断文件是否为图片
					
					if("jpg^png^jpeg^gif".indexOf(fileType)!=-1){
						//创建文件数据流对象
						output=new FileOutputStream(path+uuid+"."+fileType);
						//进行文件保存	
						IOUtils.copy(file.getInputStream(),output);
						//数据封装返回
						map.put("Code","0" );
						map.put("data", uuid+"."+fileType);
						map.put("Msg", "True");
					}else{
						map.put("Code","-2" );
						map.put("data", "False");
						map.put("Msg", "is not image");
					}
				}
			}else{
				map.put("Code","-2" );
				map.put("data", "False");
				map.put("Msg", "no images");
			}
		}catch (Exception e) {
			map.put("Code","-1" );
			map.put("data", "False");
			map.put("Msg", "Upload Fail");
		}
		finally {
			//关闭输出流
			if (output != null) {
				output.close();
			}
		}
		//返回对象
		return map;
	}

}
