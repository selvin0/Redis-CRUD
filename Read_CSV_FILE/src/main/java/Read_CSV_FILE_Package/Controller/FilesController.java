package Read_CSV_FILE_Package.Controller;
import Read_CSV_FILE_Package.Service.FilesService;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class FilesController
{
       @Autowired
       private FilesService filesService;

        @PostMapping("/uploadFilesIntoDB")
        public ResponseEntity<String> storeFileIntoDB(@RequestParam("file") MultipartFile file) throws IOException, CsvException
        {
             filesService.save(file);

             return ResponseEntity.status(HttpStatus.OK).body("Success");
        }
}
