package org.example.entity;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }
    public Set<Task> getTasks(String name){
        switch (name){
            case "ann":
                return new HashSet<>(annsTasks);
            case "bob":
                return new HashSet<>(bobsTasks);
            case "carol":
                return new HashSet<>(carolsTasks);
            case "all":
                Set<Task> taskForAll = new HashSet<>();
                taskForAll.addAll(annsTasks);
                taskForAll.addAll(bobsTasks);
                taskForAll.addAll(carolsTasks);
                taskForAll.addAll(unassignedTasks);
                return taskForAll;
            default:
                System.out.println("Geçersiz isim.");
                return new HashSet<>();
        }
    }
    //getUnion() metodu bir set listesi alır ve aldığı tüm set değerlerini union ile birleştirip döner.
    public Set<Task> getUnion(Set<Task>... tasks){
        Set<Task> allTasks = new HashSet<>();
        for(Set<Task> task : tasks) {
            allTasks.addAll(task);
        }
        return allTasks;
    }
    //getIntersect() metodu iki tane set alır ve aralarındaki kesişim kümesini bulup döner.
    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2){
        Set<Task> sameTasks = new HashSet<>(task1);
        sameTasks.retainAll(task2);
        return sameTasks;
    }
    //getDifference() metodu iki tane set alır ve ikinci set içerisindeki verileri ilk set içerisindeki verilerden çıkarır.
    public Set<Task> getDifferences(Set<Task> task1, Set<Task> task2){
        Set<Task> sameTasks = new HashSet<>(task1);
        sameTasks.removeAll(task2);
        return sameTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }
}
