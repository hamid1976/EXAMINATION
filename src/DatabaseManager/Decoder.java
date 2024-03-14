package DatabaseManager;

public class Decoder{

    public static String shiftDecode(String shift){

	switch(shift){
	case "M":return "MORNING";
	case "E":return "EVENING";
	case "N":return "NOON"; 	
	}
	return shift;
	}


public static String groupDecode(String group){

	switch (group) {
          case "M":return "MEDICAL";
          case "E":return "ENGINEERING";
          case "C":return "COMMERCE";
          case "G":return "GENERAL"; 			
 
	}
        
	return group;
}

}
