package Read_CSV_FILE_Package.Service;
import Read_CSV_FILE_Package.Entity.Files;
import Read_CSV_FILE_Package.Repository.FilesRepository;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class FilesService
{
    @Autowired
    private FilesRepository filesRepository;
    private final String FILE_PATH="D:\\A -RealTimeProjects\\";
      public void save(MultipartFile file) throws IOException, CsvException
      {
          // csv reader used to read the csv file
          CSVReader reader=new CSVReader(new FileReader(FILE_PATH+file.getOriginalFilename()));
                 List<String[]> rows= reader.readAll();

                 List<Files> filesList=new ArrayList<>();

                 for (String[] row:rows)
                 {
                     System.out.println(row[0]+","+row[1]+","+row[3]);

                     Files files=new Files();
                          files.setId(row[0]);
                          files.setDesc1(row[1]);
                          files.setDesc2(row[2]);
                          files.setVal1(row[3]);
                          files.setVal2(row[4]);
                          files.setVal3(row[5]);
                          files.setVal4(row[6]);
                          files.setVal5(row[7]);
                          files.setVal6(row[8]);
                          files.setVal7(row[9]);
                     filesList.add(files);
                 }
                 filesRepository.saveAll(filesList);
      }
}
