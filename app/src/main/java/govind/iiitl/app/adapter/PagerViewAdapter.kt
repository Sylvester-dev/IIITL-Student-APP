package govind.iiitl.app.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import govind.iiitl.app.fragments.timetable.Fri
import govind.iiitl.app.fragments.timetable.Mon
import govind.iiitl.app.fragments.timetable.Thu
import govind.iiitl.app.fragments.timetable.Tue
import govind.iiitl.app.fragments.timetable.Wed

class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        when (position) {
            0 -> fragment = Mon()
            1 -> fragment = Tue()
            2 -> fragment = Wed()
            3 -> fragment = Thu()
            4 -> fragment = Fri()
        }
        return fragment!!
    }

    override fun getCount(): Int {
        return 5
    }
}