package com.springrest.springrest;

/*4) Create a RESTful web service that validates the credit card. It means we need to check the type
of credit card like American Express, Discover, Visa etc and it is valid or not.
Valid length: 16 digits.
First 6 digits must be in one of the following ranges:
601100 through 601109
601120 through 601149
601174
601177 through 601179
601186 through 601199
644000 through 659999
enRoute
Valid length: 15 digits. First four digits must be 2014 or 2149.
JCB
Valid length: 16 to 19 digits.
First 4 digits must be in the range 3528 through 3589.
MasterCard
Valid length: 16 digits.
First digit must be 5 and second digit must be in the range 1 through 5 inclusive. The range is
510000 through 559999.
First digit must be 2 and second digit must be in the range 2 through 7 inclusive. The range is
222100 through 272099.*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringQuestion4Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuestion4Application.class, args);
	}

}
