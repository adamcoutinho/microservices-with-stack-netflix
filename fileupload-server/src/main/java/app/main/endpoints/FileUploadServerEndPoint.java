package app.main.endpoints;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/fileuploadserver")
public class FileUploadServerEndPoint {

    @GetMapping("/test")
    public String start() {
        return "<h1>FileUploadServerEndPoint</h1>";
    }

    @PostMapping("/upload-file")
    public void postFile(@RequestParam("upload")MultipartFile file) {

      file.getOriginalFilename();
    }
//
//    @PostMapping("/upload-file")
//    public void postFiles(@RequestParam("upload"    )MultipartFile file) {
//
//        file.getOriginalFilename();
//    }

}
