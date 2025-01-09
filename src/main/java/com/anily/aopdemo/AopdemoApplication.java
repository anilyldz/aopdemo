package com.anily.aopdemo;

import com.anily.aopdemo.dao.AccountDAO;
import com.anily.aopdemo.dao.MemberShipDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO accountDAO, MemberShipDAO memberShipDAO) {
		return runner -> {

			demoBeforeAdvice(accountDAO, memberShipDAO);

		};
	}

	private void demoBeforeAdvice(AccountDAO accountDAO, MemberShipDAO memberShipDAO) {
		Account account = new Account();
		account.setName("Oppenheimer");
		account.setLevel("Uranium");

		accountDAO.setName("foobar");
		accountDAO.setServiceCode("siver");

		String name = accountDAO.getName();
		String code = accountDAO.getServiceCode();

		accountDAO.addAccount(account);
		accountDAO.addAccountVIP(account, true);
		memberShipDAO.addAccount();
	}


}
