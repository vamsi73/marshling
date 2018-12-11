package Employee;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="employee")
@XmlType(propOrder = { "empno","pno","name"})

public class Employee implements Serializable{
private int empno;
private String name;
private List<PhoneNo> pno;
public List<PhoneNo> getPno() {
	return pno;
}
@XmlElementWrapper(name = "PhoneNmubers")

public void setPno(List<PhoneNo> pno) {
	this.pno = pno;
}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
