package lotto.Service;

import lotto.model.BonusNumber;
import lotto.model.Lotto;
import lotto.model.UserNumber;
import lotto.model.UserNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoService {
    private UserNumbers userNumbers;
    private Lotto lotto;
    private BonusNumber bonusNumber;
    private List<Integer> results;


    public void generateUserNumbers(int purchaseAmount) {
        userNumbers = new UserNumbers(purchaseAmount);
    }

    public List<UserNumber> getUserNumbers() {
        return userNumbers.getUserNumbers();
    }

}