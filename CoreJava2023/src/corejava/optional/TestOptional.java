package corejava.optional;

import java.util.Optional;

public class TestOptional {
	
	public static void main(String[] args) {  
        String[] str = new String[10];  
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present"); 
        
     // It returns an empty instance of Optional class   
        Optional<String> empty = Optional.empty();  
        System.out.println("\n Optional.empty"+empty);  
        
        Optional<String> value = Optional.of(str[5]);  
        
     // If value is present, it returns an Optional otherwise returns an empty Optional  
        System.out.println("1. Filtered value: "+value.filter((s)->s.equals("Abc")));  
        System.out.println("2. Filtered value: "+value.filter((s)->s.equals("JAVA OPTIONAL CLASS EXAMPLE")));  
        // It returns value of an Optional. if value is not present, it throws an NoSuchElementException    
        System.out.println("3. Getting value: "+value.get());  
        // It returns hashCode of the value  
        System.out.println("4. Getting hashCode: "+value.hashCode());  
        // It returns true if value is present, otherwise false  
        System.out.println("5. Is value present: "+value.isPresent());  
        // It returns non-empty Optional if value is present, otherwise returns an empty Optional  
        System.out.println("6. Nullable Optional: "+Optional.ofNullable(str[5]));  
        // It returns value if available, otherwise returns specified value,  
        System.out.println("7. orElse: "+value.orElse("Value is not present"));  
        System.out.println("8. orElse: "+empty.orElse("Value is not present"));  
        value.ifPresent(System.out::println);   // printing value by using method reference   
    }  

}
