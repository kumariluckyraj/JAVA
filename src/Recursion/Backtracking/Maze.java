package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
       // System.out.println(count(3,3));
       // path("",3,3);
       // System.out.println(pathRet("",3,3));
       // System.out.println(pathDiaRet("",3,3));
        boolean[][] board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = new int[board.length][board[0].length];
        System.out.println(AllpathPrintRet("",board,0,0,path,1));
        //System.out.println(pathrestrictionRet("",board,0,0));
        //System.out.println(AllpathrRet("",board,0,0));
    }
 static int count(int r, int c){
        if(r==1||c==1){
            return 1; //base condition
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
 }

 //to also print the path
    static void path(String p, int r, int c){
      if(r==1&&c==1){
          System.out.println(p);
          return;
      }
      if(r>1){
          path(p+'D',r-1,c);

      }
      if(c>1){
          path(p+'R',r,c-1);
      }



    }

    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));

        }
        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }
        return list;

    }

    static ArrayList<String> pathDiaRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathDiaRet(p + 'D', r - 1, c));

        }
        if (c > 1) {
            list.addAll(pathDiaRet(p + 'R', r, c - 1));
        }
        if(r>1&&c>1){
            list.addAll(pathDiaRet(p+'D',r-1,c-1));
        }
        return list;

    }

    static ArrayList<String> pathrestrictionRet(String p,boolean[][] maze,int r, int c) {
        if(!maze[r][c]){ //!false==true
            return new ArrayList<>();
        }

        if (r == maze.length-1 && c ==maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r < maze.length-1 ) {
            list.addAll(pathrestrictionRet(p + 'D',maze, r + 1, c));


        }
        if (c < maze[0].length-1) {
            list.addAll(pathrestrictionRet(p + 'R',maze, r, c + 1));
        }


        return list;

    }

    //THIS IS BACKTRACKING:-

    //there is an issue check your note
    static ArrayList<String> AllpathrRet(String p,boolean[][] maze,int r, int c) {


        if (r == maze.length-1 && c ==maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){ //false
            return new ArrayList<>();
        }

        //if i am concidering this block in my path
        maze[r][c]=false;


        ArrayList<String> list = new ArrayList<>();
        if (r < maze.length-1 ) {
            list.addAll(AllpathrRet(p + 'D',maze, r + 1, c));


        }
        if (c < maze[0].length-1) {
            list.addAll(AllpathrRet(p + 'R',maze, r, c + 1));
        }

        if (r>0) {
            list.addAll(AllpathrRet(p + 'U',maze, r-1, c ));
        }

        if (c>0) {
            list.addAll(AllpathrRet(p + 'L',maze, r, c-1));
        }
        //when i am getting out from here redo the changes

        maze[r][c]=true;


        return list;

    }



    //print matrix of step and path
    static ArrayList<String> AllpathPrintRet(String p,boolean[][] maze,int r, int c, int[][] path, int step) {


        if (r == maze.length-1 && c == maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return list;
        }
        if(!maze[r][c]){ //false
            return new ArrayList<>();
        }

        //if I am concidering this block in my path
        maze[r][c]=false;
        path[r][c]=step;

        ArrayList<String> list = new ArrayList<>();
        if (r < maze.length-1 ) {
            list.addAll(AllpathPrintRet(p + 'D',maze, r + 1, c,path,step+1));


        }
        if (c < maze[0].length-1) {
            list.addAll(AllpathPrintRet(p + 'R',maze, r, c + 1,path,step+1));
        }

        if (r>0) {
            list.addAll(AllpathPrintRet(p + 'U',maze, r-1, c,path,step+1 ));
        }

        if (c>0) {
            list.addAll(AllpathPrintRet(p + 'L',maze, r, c-1,path,step+1));
        }
        //when i am getting out from here redo the changes

        maze[r][c]=true;
        path[r][c]=0;

        return list;


    }




}
