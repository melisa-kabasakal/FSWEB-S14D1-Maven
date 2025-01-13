package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, double salary){
        super(id, name, salary);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper){
        for(int i = 0; i < juniorDevelopers.length; i++){
            if(juniorDevelopers[i] == null){
                juniorDevelopers[i] = juniorDeveloper;
                return;
            }
        }
    }

    public void addEmployee(MidDeveloper midDeveloper){
        for(int i = 0; i < midDevelopers.length; i++){
            if(midDevelopers[i] == null){
                midDevelopers[i] = midDeveloper;
                return;
            }
        }
    }
    public void addEmployee(SeniorDeveloper seniorDeveloper){
        for(int i = 0; i < seniorDevelopers.length; i++){
            if(seniorDevelopers[i] == null){
                seniorDevelopers[i] = seniorDeveloper;
                return;
            }
        }
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }
}
