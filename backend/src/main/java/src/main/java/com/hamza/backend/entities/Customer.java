package src.main.java.com.hamza.backend.entities;

import java.util.List;
import src.main.java.com.hamza.backend.entities.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private String email;
    private List<BankAccount> bankAccounts;
}
