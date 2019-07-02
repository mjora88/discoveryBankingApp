package com.khoza.atm;

import com.khoza.atm.service.BankingAutomatedTellerMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner
{

  @Autowired
  private BankingAutomatedTellerMachineService bankingAutomatedTellerMachineService;

  public static void main(String[] args)
  {
    SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
    app.setBannerMode(Banner.Mode.OFF);
    app.run(args);
  }


  @Override
  public void run(String... strings) throws Exception
  {
    bankingAutomatedTellerMachineService.process();
  }
}