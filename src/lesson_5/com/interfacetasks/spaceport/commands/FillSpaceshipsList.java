package lesson_5.com.interfacetasks.spaceport.commands;

import lesson_5.com.interfacetasks.spaceport.spaceships.*;

import java.util.List;

public class FillSpaceshipsList{

    private List<IStart> sourceList;

    public FillSpaceshipsList(List<IStart> sourceList) {
        this.sourceList = sourceList;
    }


    public List<IStart> Execute() {
        sourceList.add(new Shuttle("Discovery"));
        sourceList.add(new Shuttle("Columbia"));
        sourceList.add(new Soyuz("TMA"));
        sourceList.add(new Progress("M1"));
        sourceList.add(new Shuttle("Challenger"));
        sourceList.add(new SpaceX("GO Ms. Tree"));
        sourceList.add(new Soyuz("TMA-M"));
        sourceList.add(new SpaceX("GO Ms. Chief"));
        sourceList.add(new Shuttle("Atlantis"));
        sourceList.add(new SpaceX("GO Searcher"));
        sourceList.add(new Soyuz("MC"));
        sourceList.add(new Shuttle("Endeavour"));
        sourceList.add(new Progress("M-M"));
        sourceList.add(new SpaceX("GO Navigator"));
        sourceList.add(new SpaceX("GO Quest"));
        sourceList.add(new Progress("MC"));
        return sourceList;
    }
}
