//package abc.interview.a.anotes;
//
//import static org.junit.Assert.assertEquals;
//import java.util.Set;
//import java.util.TreeMap;
//import org.junit.Test;			
//
//public class TreeMapp {
//
//	@Test
//	public void givenTreeMap_whenPerformsQueries_thenCorrect() {
//		TreeMap<Integer, String> map = new TreeMap<>();
//		map.put(3, "val");
//		map.put(2, "val");
//		map.put(1, "val");
//		map.put(5, "val");
//		map.put(4, "val");
//
//		Integer highestKey = map.lastKey();
//		Integer lowestKey = map.firstKey();
//		Set<Integer> keysLessThan3 = map.headMap(3).keySet();
//		Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();
//
//		assertEquals(new Integer(5), highestKey);
//		assertEquals(new Integer(1), lowestKey);
//		assertEquals("[1, 2]", keysLessThan3.toString());
//		assertEquals("[3, 4, 5]", keysGreaterThanEqTo3.toString());
//	}
//
//}
