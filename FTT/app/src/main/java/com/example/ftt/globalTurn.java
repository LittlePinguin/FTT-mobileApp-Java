package com.example.ftt;

import android.app.Application;

public class globalTurn extends Application {
    int turn, end, nbTeams, type;
    int [] points = new int[5];
    int [] read = new int[19];

    int getTurn(){
        return turn;
    }

    void setTurn(int turn){
        this.turn = turn;
    }

    void initPoints(int team){
        for (int i=1; i<team; i++){
            this.points[i] = 0;
        }
    }

    int getPoints(int team){
        return points[team];
    }

    void addPoints(int team){
        this.points[team]+=1;
    }

    int getWinner(){
        int winner = 0, max = 0;
        for (int i=1; i<this.points.length; i++){
            if (max<this.points[i]){
                winner = i;
                max = this.points[i];
            }
        }
        return winner;
    }

    void setEnd(){
        this.end = 0;
    }

    int getEnd(){
        return end;
    }

    void addEnd(){
        this.end+=1;
    }

    void initRead(){
        for (int i=1; i<6; i++){
            this.read[i] = 0;
        }
    }

    void setRead(int story){
        this.read[story] = 1;
    }

    int checkRead(int story){
        if (this.read[story] == 1){
            return 1;
        }
        else {
            return 0;
        }
    }

    /*int searchRead(){
        for (int i =1; i<this.read.length; i++){
            if (this.read[i] == 0){
                return 0;
            }
        }
        return 1;
    }*/

    void setNbTeams(int teams){
        this.nbTeams = teams;
    }

    int getNbTeams(){
        return nbTeams;
    }

    void setType(int type){
        this.type = type;
    }

    int getType(){
        return this.type;
    }
}