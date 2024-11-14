import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Collection: LinkedList implementation");
        System.out.println("1. LinkeList task1:");
        System.out.println("a) Create a LinkedList set and fill up with values");
        LinkedList<String> texts = new LinkedList<>();
        texts.add("Alif");
        texts.add("Ba");
        texts.add("Ta");
        texts.add("Thaa");
        System.out.println("b) Print those values using Iterator");
        Iterator<String> iterator = texts.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("c) Print the size of set and then clear it all");
        System.out.println(texts.size());
        texts.clear();
        System.out.println(texts);

        System.out.println("\n2. LinkeList task2:");
        LinkedList<String> cars = new LinkedList<>();
        cars.add("Ferrari");
        cars.add("Bentley");
        cars.add("Bugatti");
        cars.add("Alfa-Romeo");
        System.out.println("a) Write a method to display the LinkedList collection in reverse order on the screen.");
        System.out.println("Before reverse:");
        cars.forEach(c -> {
            System.out.println(c);
        });
        System.out.println("\nAfter reverse:");
        LinkedList<String> reversedCars = cars.reversed();
        reversedCars.forEach(c -> {
            System.out.println(c);
        });
        System.out.println("b) Add an element to the beginning and the end of the LinkedList collection.");
        reversedCars.addFirst("Car added to the beginning of list: Legend Nexia, lol");
        System.out.println(reversedCars);
        reversedCars.addLast("Car added to the end of list: Legend Gentra, lol");
        System.out.println(reversedCars);
        System.out.println("c) Display the first and last elements of the LinkedList collection on the screen.");
        System.out.println(reversedCars.getFirst());
        System.out.println(reversedCars.getLast());

        System.out.println("3. LinkedList task 3");
        LinkedList<String> veggies = new LinkedList<>();
        veggies.add("Pototes");
        veggies.add("Eggplant");
        veggies.add("Onion");
        veggies.add("Cabbage");
        Main operations = new Main();
        System.out.println("a) Write a method to remove the value at a specific index from the LinkedList collection.");
        System.out.println("Before removing an element");
        System.out.println(veggies);
        System.out.print("After removing an element named: ");
        System.out.println(operations.elementRemoved(veggies, 2));
        System.out.println("The new list is: " + veggies);
        System.out.println("\nb) Write a method to remove the first and last elements from the LinkedList collection, " +
                "then display these removed elements on the screen.");
        System.out.println("Before removal:");
        System.out.println(veggies);
        System.out.println("Removed veggies:");
        System.out.println(operations.firstLastRemoved(veggies));

        System.out.println("\nc) Remove all elements from the LinkedList collection.");
        veggies.remove();
        System.out.println(veggies);

        System.out.println("4. LinkedList task 4");
        System.out.println("a) Write a method that combines two LinkedList collections " +
                "and returns the merged collection.");
        LinkedList<Double> listNum1 = new LinkedList<>();
        listNum1.add(21.2);
        listNum1.add(54.2);
        listNum1.add(32.2);
        LinkedList<Double> listNum2 = new LinkedList<>();
        listNum2.add(223.3);
        listNum2.add(32.3);
        listNum2.add(65.3);
        LinkedList<Double> combinedLists = combined(listNum1, listNum2);
        System.out.println(combinedLists);

        System.out.println("\nb) Create a copy of the LinkedList collection.");
        LinkedList<Double> copyVersion = new LinkedList<>(listNum1);
        System.out.println(copyVersion);

        System.out.println("\nc) Write a method that removes the first element of the LinkedList collection " +
                "and displays the remaining elements on the screen.");
        System.out.println("Before removal: " + copyVersion);
        System.out.println("After removal: ");
        operations.removeFirstPrintRemaining(copyVersion);

        System.out.println("\n5. LinkedList task 5: ");
        System.out.println("a) Write a method that shuffles the elements of the LinkedList collection.");
        operations.shuffleElements(listNum2);
        System.out.println(listNum2);

        System.out.println("\nb) LinkedList to’plam elementlarini ArrayList to’plamiga ko’chirib o’tkazing.");
        LinkedList<String> linkedStrings = new LinkedList<>();
        linkedStrings.add("Hello");
        linkedStrings.add("Bonjour");
        linkedStrings.add("Salom");
        linkedStrings.add("Hola");
        linkedStrings.add("Halo");
        ArrayList<String> arrayStrings = new ArrayList<>(linkedStrings);

        System.out.println("\nc) Sort the elements of the LinkedList collection in ascending order and check if a specific element exists in it.");
        System.out.println("Unsorted list: " + linkedStrings);
        Collections.sort(linkedStrings);
        System.out.println("Sorted list: " + linkedStrings);
        String trackIfExists = "Salom";
        if(linkedStrings.contains(trackIfExists)){
            System.out.println("The element " + trackIfExists + " is in the list");
        }else{
            System.out.println("The element " + trackIfExists + " is not the list");
        }
    }

    public String firstLastRemoved(LinkedList<String> list){
        String first = list.removeFirst();
        String last = list.removeLast();
        return first + " " + last;
    }
    public String elementRemoved(LinkedList<String> list, int index){
        String element = list.remove();
        return element;
    }

    public static LinkedList<Double> combined(LinkedList<Double> list1, LinkedList<Double> list2){
        LinkedList<Double> combined = new LinkedList<>(list1);
        combined.addAll(list2);
        return combined;
    }

    public void removeFirstPrintRemaining(LinkedList<Double> list){
        list.removeFirst();
        System.out.println("Remaining elements: " + list);
    }

    public void shuffleElements(LinkedList<Double> list){
        Collections.shuffle(list);
    }
}