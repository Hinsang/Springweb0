package Ezenweb.view;

import Ezenweb.model.Dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Index {

    Scanner scanner = new Scanner(System.in);
    public void index() {
        System.out.println("------- 메인 페이지 -------");
        signup();
    }

    public void signup() {
        System.out.println("------- 회원 가입 페이지 -------");
        scanner.nextLine();
        System.out.println("이메일 : ");
        String memail = scanner.nextLine();
        System.out.println("인증코드 : ");
        String code = scanner.nextLine();
        System.out.println("비밀번호 : ");
        String mpassword = scanner.nextLine();
        System.out.println("비밀번호확인 : ");
        String mpasswordcheck = scanner.nextLine();

        // 1. 빈생성자
        MemberDto dto1 = new MemberDto();

        // 2. 풀생성자
        MemberDto dto2 = new MemberDto(0, memail, mpassword);

        // 3-1. set
        dto1.setMno(0);
        dto1.setMemail(memail);
        dto1.setMpassword(mpassword);
        // 3-2. get
        System.out.println(dto1.getMno());
        System.out.println(dto1.getMemail());
        System.out.println(dto1.getMpassword());
        // 4. toString() [ @ToString() ]
        System.out.println(dto2.toString());

        // 5. @Builder
            // 1. 매개변수 개수 제한x
            // 2. 매개변수 순서 제한x
        MemberDto dto3 = MemberDto.builder()
                .mno(0)
                .memail(memail)
                .mpassword(mpassword)
                .build();
        System.out.println("빌더로 생성된 객체 정보 : " + dto3.toString());

    }

}

