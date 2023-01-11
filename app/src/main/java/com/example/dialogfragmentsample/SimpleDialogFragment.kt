package com.example.dialogfragmentsample

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager

/**
 * A simple [Fragment] subclass.
 * Use the [SimpleDialogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SimpleDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.fragment_simple_dialog, null)
        builder.setView(view)
        return builder.create()
    }

    companion object {
        private const val TAG = "SimpleDialogFragment"
        /**
         * Use this factory method to create a new instance.
         * @return A new instance of fragment SimpleDialogFragment.
         */
        @JvmStatic
        fun newInstance() =
            SimpleDialogFragment().apply {

            }
        fun show(fragmentManager: FragmentManager) = newInstance().show(fragmentManager, TAG)
    }
}