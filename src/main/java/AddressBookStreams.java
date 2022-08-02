import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AddressBookStreams {

    public static void main(String[] args) {
        List<String> StringListFirstName = Arrays.asList("Srushti","Srushti","Ajay","Rasika","Ruchika","Jidnya");
        List<String> StringListLastName = Arrays.asList("Mane","Mane","Jadhav","Pawar","Shinde","Kadam");

        Set<String> result = findDuplicateBySetAdd(StringListFirstName);
        Set<String> result1 = findDuplicateBySetAdd(StringListLastName);
        result.forEach(System.out::println);
        result1.forEach(System.out::println);
    }
    public static <T> Set<T>findDuplicateBySetAdd(List<T> list){
        Set<T> items = new HashSet<>();
        return list.stream()
                .filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }
    }



