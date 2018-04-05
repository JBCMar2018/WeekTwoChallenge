package me.afua.weeklychallenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeekTwoChallenge {
    public static void main(String[] args) {


        //Set up variables
        boolean stop = false; //Stops loops
        String answer ="n"; //Defaults to 'no', but can change depending on user input
        Person person = new Person();

        //Create scanner for user input
        Scanner keyboard = new Scanner(System.in);

        //Create arrays to hold values
        ArrayList <Education> degrees = new ArrayList<>();
        ArrayList <Experience> work = new ArrayList<>();
        ArrayList<Skill> skills = new ArrayList<>();


        //Get person details

            System.out.println("Enter details about yourself:");

            System.out.println("Enter first name:");
            person.setFirstName(keyboard.nextLine());

            System.out.println("Enter last name");
            person.setLastName(keyboard.nextLine());

            System.out.println("Enter e-mail address");
            person.setEmail(keyboard.nextLine());

            System.out.println("Enter phone number");
            person.setPhoneNumber(keyboard.nextLine());

        //Education
        do{
            Education edu = new Education();
            System.out.println("Enter details about your education:");
            System.out.println("Enter degree:");
            edu.setDegree(keyboard.nextLine());
            System.out.println("Enter year");
            edu.setYear(keyboard.nextLine());
            System.out.println("Enter institution");
            edu.setInstitution(keyboard.nextLine());
            degrees.add(edu);

            System.out.println("Would you like to enter details for another degree?");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("n"))
                stop=true;
        }while(!stop);


        //Work Experience
        stop = false;
        do{
            Experience exp = new Experience();
            System.out.println("Enter details about your experience:");
            System.out.println("Enter title:");
            exp.setTitle(keyboard.nextLine());
            System.out.println("Enter start date");
            exp.setStartDate(keyboard.nextLine());
            System.out.println("Enter end date");
            exp.setEndDate(keyboard.nextLine());
            System.out.println("Enter organization");
            exp.setOrganization(keyboard.nextLine());
            work.add(exp);

            System.out.println("Would you like to enter details for another work experience?");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("n"))
                stop=true;
        }while(!stop);

        //Skill
        stop = false;
        do{
            Skill aSkill = new Skill();
            System.out.println("Enter details about your skills:");

            System.out.println("Enter skill:");
            aSkill.setSkillName(keyboard.nextLine());

            System.out.println("Enter proficiency (1 to 5)");
            aSkill.setProficiency(keyboard.nextInt());
            keyboard.nextLine();

            skills.add(aSkill);

            System.out.println("Would you like to enter details for another skill?");
            answer = keyboard.nextLine();
            if(answer.equalsIgnoreCase("n"))
                stop=true;
        }while(!stop);


        //Output everything. Don't forget the enhanced for loops!

        System.out.println("These are the values that you have entered:");
        System.out.println("************************************************************");
        System.out.println("PERSONAL INFORMATION:");
        System.out.println("************************************************************");
        System.out.println("Full name:"+person.getFirstName()+" "+person.getLastName());
        System.out.println("E-mail:"+person.getEmail());
        System.out.println("Phone number:"+person.getPhoneNumber()+"\n");

        System.out.println("************************************************************");
        System.out.println("EDUCATION INFORMATION:");
        System.out.println("************************************************************");
        for(Education eachDegree: degrees)
        {
            System.out.println("Degree:"+eachDegree.getDegree());
            System.out.println("Institution:"+eachDegree.getInstitution());
            System.out.println("Year:"+eachDegree.getYear()+"\n");
        }
        System.out.println("************************************************************");
        System.out.println("WORK EXPERIENCE:");
        System.out.println("************************************************************");
        for(Experience eachExperience:work)
        {
            System.out.println("Title:"+eachExperience.getTitle());
            System.out.println("Organization:"+eachExperience.getOrganization());
            System.out.println("Duties:"+eachExperience.getDuties());
            System.out.println("Dates:"+eachExperience.getStartDate()+" - "+eachExperience.getEndDate()+"\n");
        }

        System.out.println("************************************************************");
        System.out.println("SKILL INFORMATION:");
        System.out.println("************************************************************");

        for(Skill eachSkill: skills)
        {
            System.out.println("Skill:"+eachSkill.getSkillName());
            System.out.println("Proficiency:"+eachSkill.getProficiency()+"\n");
        }

    }
}
