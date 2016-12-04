/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgraphs;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafxgraphs.modelo.DummyType;
import javafxgraphs.tad.Edge;
import javafxgraphs.tad.Graph;
import javafxgraphs.tad.GraphImpl;
import javafxgraphs.ui.GraphDraw;
import javafxgraphs.tad.Vertex;
import projeto1pa.CalcularMaisCurto;
import projeto1pa.Ligacao;
import projeto1pa.Local;
import projeto1pa.MiniJogoImp;

/**
 *
 * @author brunomnsilva
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
//        Implementation of Graph needed!!!
        Graph<DummyType, DummyType> myG = new GraphImpl<>(); 
      
        Vertex<DummyType> vA = myG.insertVertex(new DummyType("A"));
        Vertex<DummyType> vB = myG.insertVertex(new DummyType("B"));
        Vertex<DummyType> vC = myG.insertVertex(new DummyType("C"));
        Vertex<DummyType> vD = myG.insertVertex(new DummyType("D"));
        
        myG.insertEdge(vA, vB, new DummyType("AB"));
        myG.insertEdge(vA, vB, new DummyType("AB2")); //second edge
        myG.insertEdge(vA, vC, new DummyType("AC"));
        myG.insertEdge(vA, vD, new DummyType("AD"));
        
        
        MiniJogoImp miniJogo = new MiniJogoImp(new CalcularMaisCurto());
        
        Graph<Local, Ligacao> graph = new GraphImpl<>();
        
        Local local1 = new Local("A");
        Local local2 = new Local("B");
        Local local3 = new Local("C");
        Local local4 = new Local("D");
        
        Ligacao ligacao1 = new Ligacao("AB", 10, 10);
        Ligacao ligacao2 = new Ligacao("BC", 15, 10);
        Ligacao ligacao3 = new Ligacao("CD", 20, 10);
        Ligacao ligacao4 = new Ligacao("DA", 25, 10);
        
        Vertex<Local> vertex1 = miniJogo.insertVertex(local1);
        Vertex<Local> vertex2 = miniJogo.insertVertex(local2);
        Vertex<Local> vertex3 = miniJogo.insertVertex(local3);
        Vertex<Local> vertex4 = miniJogo.insertVertex(local4);
        
        Edge<Ligacao, Local> edge1 = miniJogo.insertEdge(local1, local2, ligacao1);
        Edge<Ligacao, Local> edge2 = miniJogo.insertEdge(local2, local3, ligacao2);
        Edge<Ligacao, Local> edge3 = miniJogo.insertEdge(local3, local4, ligacao3);
        Edge<Ligacao, Local> edge4 = miniJogo.insertEdge(local4, local1, ligacao4);
        
        //CalcularMaisCurto curto = new CalcularMaisCurto();
        
        miniJogo.selecionarOrigemDestino();
        Iterable<Edge<Ligacao, Local>> solucao = miniJogo.calcularSolucao();
        
//        System.out.println(miniJogo.getOrigem().element().toString());
//        System.out.println(miniJogo.getDestino().element().toString());
        
        //this should be moved to the implementing class
        for (Edge<Ligacao, Local> ed : solucao) {
            System.out.println(ed.element().toString());
        }
        //etc.
        
        BorderPane root = new BorderPane();
      
        GraphDraw<DummyType, DummyType> draw = new GraphDraw(myG);        
        
        VBox empty = new VBox();
        empty.setAlignment(Pos.CENTER);
        empty.getChildren().add( new Text("Graph Drawing with JavaFX") );
        
        root.setCenter(draw);
        root.setTop(empty);
        
        //stylesheet and css selectors
        root.getStylesheets().addAll(this.getClass().getResource("/javafxgraphs/ui/resources/style.css").toExternalForm());
        root.setId("pane");
      
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Graph!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
