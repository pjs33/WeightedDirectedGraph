package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import classes.WeightedDirectedEdge;

public class WeightedDirectedEdgeTest {
	
	@Test
	private void testConstructor() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "B";
		int weight = 1;
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
		
		// Test instance variables set by constructor
		assertEquals("A",wde.getFromVertex());
		assertEquals("B",wde.getToVertex());
		assertEquals(1,wde.getWeight());
	}
	
	@Test(expected = IllegalArgumentException.class)
	private void testConstructorIllegalFromVertexArgument() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "";
		String toVertex = "B";
		int weight = 1;
		
		// This should throw an IllegalArgumentException 
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
	}
	
	@Test(expected = IllegalArgumentException.class)
	private void testConstructorIllegalToVertexArgument() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "";
		int weight = 1;
		
		// This should throw an IllegalArgumentException 
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
	}
	
	@Test(expected = IllegalArgumentException.class)
	private void testConstructorIllegalVertexArguments() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "";
		String toVertex = "";
		int weight = 1;
		
		// This should throw an IllegalArgumentException 
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
	}
	
	@Test
	private void testFromVertexGetSet() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "B";
		int weight = 1;
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
		
		// Test setting fromVertex to another string
		wde.setFromVertex("C");
		assertEquals("C",wde.getFromVertex());
		assertEquals("B",wde.getToVertex());
		assertEquals(1,wde.getWeight());
		
		// Test setting fromVertex to same string as toVertex
		wde.setFromVertex("B");
		assertEquals("B",wde.getFromVertex());
		assertEquals("B",wde.getToVertex());
		assertEquals(1,wde.getWeight());
	}
	
	@Test(expected = IllegalArgumentException.class)
	private void testFromVertexSetIllegalArgument() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "B";
		int weight = 1;
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
		
		// This should throw an IllegalArgumentException 
		wde.setFromVertex("");
	}
	
	@Test
	private void testToVertexGetSet() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "B";
		int weight = 1;
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
		
		// Test setting toVertex to another string
		wde.setToVertex("C");
		assertEquals("A",wde.getFromVertex());
		assertEquals("C",wde.getToVertex());
		assertEquals(1,wde.getWeight());
		
		// Test setting toVertex to same string as fromVertex
		wde.setToVertex("A");
		assertEquals("A",wde.getFromVertex());
		assertEquals("A",wde.getToVertex());
		assertEquals(1,wde.getWeight());
	}
	
	@Test(expected = IllegalArgumentException.class)
	private void testToVertexSetIllegalArgument() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "B";
		int weight = 1;
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
		
		// This should throw an IllegalArgumentException 
		wde.setToVertex("");
	}
	
	@Test
	private void testWeightGetSet() {
		
		// Initialize WeightedDirectedEdge
		String fromVertex = "A";
		String toVertex = "B";
		int weight = 1;
		WeightedDirectedEdge wde = new WeightedDirectedEdge(fromVertex, toVertex, weight);
		
		// Test setting weight to another positive integer
		wde.setWeight(2);
		assertEquals(2,wde.getWeight());
		assertEquals("A",wde.getFromVertex());
		assertEquals("B",wde.getToVertex());
		
		// Test setting weight to a negative number
		wde.setWeight(-1);
		assertEquals(-1,wde.getWeight());
		assertEquals("A",wde.getFromVertex());
		assertEquals("B",wde.getToVertex());
		
		// Test setting weight to zero
		wde.setWeight(0);
		assertEquals(0,wde.getWeight());
		assertEquals("A",wde.getFromVertex());
		assertEquals("B",wde.getToVertex());
	}
}
