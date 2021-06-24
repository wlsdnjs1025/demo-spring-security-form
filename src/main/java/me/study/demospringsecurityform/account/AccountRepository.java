package me.study.demospringsecurityform.account;

import org.springframework.data.jpa.repository.JpaRepository;

// JPA가 제공해주는 기능: interface만 만들어도 구현체가 자동으로 만들어지고 bean으로 등록됨
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByUsername(String username);
    Account save(Account account);
}
