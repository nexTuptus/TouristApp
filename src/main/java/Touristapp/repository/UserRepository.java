package Touristapp.repository;

import Touristapp.model.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
