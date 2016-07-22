package ly.generalassemb.espresso;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasErrorText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.core.deps.guava.base.Strings;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


/**
 * Created by ander on 7/21/2016.
 */
public class BalanceActivityTest {
    @Rule
    public ActivityTestRule<BalanceActivity> mainActivityActivityTestRule = new ActivityTestRule<BalanceActivity>(BalanceActivity.class);

    @Test
    public void currentBalVw(){
        onView(withId(R.id.balanceTextView))
                .check(matches(isDisplayed()));
    }

    @Test
    public void withdrawMoney() {
        String value1 = "Title";
        String value2 = "20";
        onView(withId(R.id.newTransactionButton))
                .perform(click());
        onView(withId(R.id.descriptionEditText))
                .perform(typeText(value1), closeSoftKeyboard());
        onView(withId(R.id.amountEditText))
                .perform(typeText(value2), closeSoftKeyboard());
        onView(withId(R.id.withdrawButton))
                .perform(click());
        onView(withId(R.id.balanceTextView))
                .check(matches(withText("-$20.00")));
    }

    @Test
    public void depositMoney() {
        String value1 = "Title";
        String value2 = "20";
        onView(withId(R.id.newTransactionButton))
                .perform(click());
        onView(withId(R.id.descriptionEditText))
                .perform(typeText(value1), closeSoftKeyboard());
        onView(withId(R.id.amountEditText))
                .perform(typeText(value2), closeSoftKeyboard());
        onView(withId(R.id.depositButton))
                .perform(click());
        onView(withId(R.id.balanceTextView))
                .check(matches(withText("$20.00")));
    }

    @Test
    public void depositAndWithdrawMultiples() {
        String value1 = "Title";
        String value2 = "20";
        onView(withId(R.id.newTransactionButton))
                .perform(click());
        onView(withId(R.id.descriptionEditText))
                .perform(typeText(value1), closeSoftKeyboard());
        onView(withId(R.id.amountEditText))
                .perform(typeText(value2), closeSoftKeyboard());
        onView(withId(R.id.depositButton))
                .perform(click());

        onView(withId(R.id.newTransactionButton))
                .perform(click());
        onView(withId(R.id.descriptionEditText))
                .perform(typeText(value1), closeSoftKeyboard());
        onView(withId(R.id.amountEditText))
                .perform(typeText(value2), closeSoftKeyboard());
        onView(withId(R.id.depositButton))
                .perform(click());

        onView(withId(R.id.newTransactionButton))
                .perform(click());
        onView(withId(R.id.descriptionEditText))
                .perform(typeText(value1), closeSoftKeyboard());
        onView(withId(R.id.amountEditText))
                .perform(typeText(value2), closeSoftKeyboard());
        onView(withId(R.id.depositButton))
                .perform(click());

        onView(withId(R.id.newTransactionButton))
                .perform(click());
        onView(withId(R.id.descriptionEditText))
                .perform(typeText(value1), closeSoftKeyboard());
        onView(withId(R.id.amountEditText))
                .perform(typeText(value2), closeSoftKeyboard());
        onView(withId(R.id.withdrawButton))
                .perform(click());

        onView(withId(R.id.balanceTextView))
                .check(matches(withText("$40.00")));
    }


}
