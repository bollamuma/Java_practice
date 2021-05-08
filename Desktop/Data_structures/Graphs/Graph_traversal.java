// traversing a graph

import java.util.*;

  public class Graph_traversal {

      public static void main(String[]args){

          int V=4; //no. of vertices --- 0,1,2,3,4

        ArrayList <ArrayList<Integer>> graph = new ArrayList <ArrayList<Integer>>(V);
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();

          for (int i = 0; i < V; i++)
              graph.add(new ArrayList<Integer>());
        graph.get(0).add(1);
        graph.get(0).add(2);
       // graph.get(0).add(3);

        //graph.get(1).add(0);
        graph.get(1).add(2);


        graph.get(2).add(0);
        graph.get(2).add(3);
        //graph.get(2).add(4);

        graph.get(3).add(3);

       // graph.get(4).add(2);

        // check graph

          //System.out.println(graph.size());
         /* for(int i=0;i<graph.size();i++)
          {
              System.out.print(i+":");
              for(int j=0;j<graph.get(i).size();j++)
                  System.out.print(graph.get(i).get(j));
              System.out.println("");
          }*/


          BFT(2,visited,graph,q);
          for(int i=0;i< visited.length;i++)
              visited[i] = false;

          DFT(2,visited,graph,1);


      }

      public static void BFT(int i,boolean[] visited, ArrayList<ArrayList<Integer>> graph,Queue<Integer> q)
      {

          q.add(i);
          visited[i] = true;
          System.out.print("BST starting from "+i+" is ");
          System.out.print(i+" ");
          while(q.size()!=0)
          {
              i=q.poll();
              Iterator<Integer> itr = graph.get(i).iterator();
              while(itr.hasNext())
              {
                  int j = itr.next();

                  if(visited[j]==false)
                  {
                      System.out.print(j+" ");
                      q.add(j);
                      visited[j]=true;
                  }
              }

          }
          System.out.println("");

      }

      public static void DFT(int i,boolean[] visited, ArrayList<ArrayList<Integer>> graph,int count)
      {
          if(count==1)
          System.out.print("DFT starting from "+i+" is ");
          visited[i]=true;
          System.out.print(i+" ");
          Iterator<Integer> itr = graph.get(i).iterator();
          while(itr.hasNext())
          {
              int j = itr.next();

              if(visited[j]==false)
              {
                  //System.out.print(j+" ");

                  //visited[j]=true;
                  DFT(j,visited,graph,count+1);
              }
          }
      }


}


