package com.crypto_pulse.repository;

import com.crypto_pulse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
