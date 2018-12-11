package marshling;

import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

import Employee.Employee;
import Employee.PhoneNo;

public class MarshallingProcess {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.setEmpno(73);
		e.setName("vamsi");
		PhoneNo pno=new PhoneNo();
		PhoneNo pno1=new PhoneNo();
		pno.setDistributer("Aitel");
		pno.setPhnumber("13253");
		List<PhoneNo> p=new ArrayList();
		pno.setDistributer("Aitel");
		pno.setPhnumber("13253");
		pno1.setDistributer("voda");
		pno1.setPhnumber("1325343");
		p.add(pno);
		p.add(pno1);
		e.setPno(p);
		StringWriter writer = new StringWriter();
		JAXBContext context=JAXBContext.newInstance(Employee.class);
		Marshaller m=context.createMarshaller();
		//m.marshal(e,System.out);
		m.marshal(e,writer);
		String xml=writer.toString();
		System.out.println(xml);
	

	}

}


