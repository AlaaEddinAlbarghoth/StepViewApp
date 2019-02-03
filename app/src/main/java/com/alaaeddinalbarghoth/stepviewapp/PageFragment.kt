package com.alaaeddinalbarghoth.stepviewapp

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_page.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [PageFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [PageFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class PageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page, container, false)
    }

    override fun onActivityCreated(@Nullable savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val page = arguments!!.getInt("page", 0)
        val pagerState = arguments!!.getBoolean("isLast")
        if (pagerState)
            lblPage?.text = getString(R.string.done)
        else
            lblPage?.text = Integer.toString(page) as String
    }

    companion object {
        @JvmStatic
        fun newInstance(page: Int, isLast: Boolean) =
            PageFragment().apply {
                arguments = Bundle().apply {
                    putInt("page", page)
                    if (isLast)
                        putBoolean("isLast", true)
                }
            }
    }
}
