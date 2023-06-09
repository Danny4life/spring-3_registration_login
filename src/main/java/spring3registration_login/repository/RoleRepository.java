package spring3registration_login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring3registration_login.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
