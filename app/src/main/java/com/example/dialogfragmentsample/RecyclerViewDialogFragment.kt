package com.example.dialogfragmentsample

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(activity)
        val inflater = requireActivity().layoutInflater
        val view = inflater.inflate(R.layout.fragment_recycler_view_dialog, null)
        val mRecyclerView = view.findViewById(R.id.recycler_view) as RecyclerView
        val mLayoutManager = LinearLayoutManager(activity);
        val mAdapter =  MyAdapter()
        mRecyclerView!!.adapter = mAdapter
        mRecyclerView!!.layoutManager = mLayoutManager;
        builder.setView(view)
        return builder.create()
    }

    companion object {
        private const val TAG = "RecyclerViewDialogFragment"
        @JvmStatic
        fun newInstance() =
            RecyclerViewDialogFragment().apply {

            }
        fun show(fragmentManager: FragmentManager) = RecyclerViewDialogFragment.newInstance()
            .show(fragmentManager, TAG)
    }
}