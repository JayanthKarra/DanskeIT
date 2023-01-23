package coreJava8.lambda.person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestPerson {
	public static void main(String[] main)
	{
		List<Person> personList= Arrays.asList(
				new Person(" Sams","DSouza",21),
				new Person(" Marry","James",22),
				new Person(" Maggi","Rouf",23));
				
				//Sort the list by lastname
		Collections.sort(personList,new Comparator<Person>() {
						@Override
						public int compare(Person p1, Person p2) {
						return p1.lastName.compareTo(p1.lastName);
						}
		});
		//print all records - without Lambda
		System.out.println(" Display person list without Lambda");
		for(Person p: personList)
				System.out.println(p);
		
		
		System.out.println(" Display person list using Lambda");
		//print all records - with Lambda
		personList.forEach(  (p)->System.out.println(p.getFirstName()+"  - "+ p.getAge())     ); 

	}

}
