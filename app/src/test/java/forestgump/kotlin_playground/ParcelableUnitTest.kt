package forestgump.kotlin_playground

import android.content.Intent
import forestgump.kotlin_playground.activity.MainActivity
import forestgump.kotlin_playground.entity.Product
import org.junit.Test

import org.junit.Assert.*
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowApplication


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class ParcelableUnitTest {

    @Test
    fun isParceled() {

        val expectedIntent = Intent()
                .putExtra("test_parcelable", Product("testValue", "testValue2"))

        val mainActivity = Robolectric.buildActivity(MainActivity::class.java, expectedIntent)
                .create()
                .get();

        assertEquals(mainActivity.intent.getParcelableExtra<Product>("test_parcelable"),
                expectedIntent.getParcelableExtra("test_parcelable"))
    }
}
