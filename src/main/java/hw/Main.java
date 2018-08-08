package hw;

import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

import java.util.Iterator;

public class Main {
  public static void main(final String[] args) {
    final String RU = CountryCodes.RU;
    final String EE = CountryCodes.EE;
    final String LV = CountryCodes.LV;
    final String BY = CountryCodes.BY;
    final String UA = CountryCodes.UA;
    final String MN = CountryCodes.MN;

    final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);

    myMap.addVertex(RU);
    myMap.addVertex(EE);
    myMap.addVertex(LV);
    myMap.addVertex(BY);
    myMap.addVertex(UA);
    myMap.addVertex(MN);

    myMap.addEdge(RU, EE);
    myMap.addEdge(RU, LV);
    myMap.addEdge(RU, BY);
    myMap.addEdge(RU, UA);
    myMap.addEdge(RU, MN);

    myMap.addEdge(EE, LV);

    myMap.addEdge(LV, BY);

    myMap.addEdge(BY, UA);


    System.out.println("\nBreadth first iteration starting from Russia");
    final Iterator<String> bf1 = new BreadthFirstIterator<>(myMap, RU);
    while (bf1.hasNext()) {
      final String country = bf1.next();
      System.out.println(country);
    }

    System.out.println("\nBreadth first iteration starting from Belarus");
    final Iterator<String> bf2 = new BreadthFirstIterator<>(myMap, BY);
    while (bf2.hasNext()) {
      final String country = bf2.next();
      System.out.println(country);
    }

    System.out.println("\nClosest first iteration starting from Russia");
    final Iterator<String> cf1 = new ClosestFirstIterator<>(myMap, RU);
    while (cf1.hasNext()) {
      final String country = cf1.next();
      System.out.println(country);
    }

    System.out.println("\nClosest first iteration starting from Belarus");
    final Iterator<String> cf2 = new ClosestFirstIterator<>(myMap, BY);
    while (cf2.hasNext()) {
      final String country = cf2.next();
      System.out.println(country);
    }

    System.out.println("\nDepth first iteration starting from Russia");
    final Iterator<String> df1 = new DepthFirstIterator<>(myMap, RU);
    while (df1.hasNext()) {
      final String country = df1.next();
      System.out.println(country);
    }

    System.out.println("\nDepth first iteration starting from Belarus");
    final Iterator<String> df2 = new DepthFirstIterator<>(myMap, BY);
    while (df2.hasNext()) {
      final String country = df2.next();
      System.out.println(country);
    }

    System.out.println("\nRandom walk iteration starting from Russia");
    final Iterator<String> rf1 = new RandomWalkIterator<>(myMap, RU, false, myMap.vertexSet().size());
    while (rf1.hasNext()) {
      final String country = rf1.next();
      System.out.println(country);
    }

    System.out.println("\nRandom walk iteration starting from Belarus");
    final Iterator<String> rf2 = new RandomWalkIterator<>(myMap, BY, false, myMap.vertexSet().size());
    while (rf2.hasNext()) {
      final String country = rf2.next();
      System.out.println(country);
    }

    GreedyColoring<String, DefaultEdge> greedyColoring = new GreedyColoring<>(myMap);
    System.out.println("\n"+greedyColoring.getColoring());

  }
}