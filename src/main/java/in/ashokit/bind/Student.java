package in.ashokit.bind;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class Student 
{
	private String studentName;
	private Integer studentId;
	private Integer studentAge;
	private String studentEmail;
	private Integer studnetRank;

}
