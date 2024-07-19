package Read_CSV_FILE_Package.Repository;
import Read_CSV_FILE_Package.Entity.Files;
import org.springframework.data.jpa.repository.JpaRepository;
public interface FilesRepository extends JpaRepository<Files,String>
{

}
