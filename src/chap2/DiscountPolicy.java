package chap2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ... discountConditions) {
        this.conditions = Arrays.asList(discountConditions);
    }

    public Money calculateDiscountAmount(Screening screening){
        for (DiscountCondition discountCondition : conditions){
            if(discountCondition.isSatisfiedBy(screening)){
                return getDiscountAmount(screening);
            }
        }
        return Money.ZERO;
    }

    protected abstract Money getDiscountAmount(Screening screening);
}
