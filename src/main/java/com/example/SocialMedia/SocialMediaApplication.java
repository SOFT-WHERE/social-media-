package com.example.SocialMedia;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SocialMediaApplication.class, args);

		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Scanner sc=new Scanner(System.in);

		User user=(User)applicationContext.getBean("user");

		System.out.println("Enter username:");
		String userName=sc.next();
		user.setUserName(userName);

		PostList postList=(PostList)applicationContext.getBean("postList");

		while (true) {
			System.out.println("choose option:\n1. create post \n2. see all post");
			int userSelect=sc.nextInt();

			switch (userSelect) {
				case 1:
					Post post=(Post)applicationContext.getBean("post");
					sc.nextLine();
					String msg=sc.nextLine();
					post.setMessage(msg);
					postList.setPost(post);
					user.setPostList(postList);
					break;
				case 2:
					postList.getPost().forEach(item->{System.out.println(item.getMessage());});
					break;
				
			}

		}
	}

}
