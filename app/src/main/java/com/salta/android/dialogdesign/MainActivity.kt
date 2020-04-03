package com.salta.android.dialogdesign

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.layout_success_dialog.view.*
import kotlinx.android.synthetic.main.layout_success_dialog.view.imageIcon
import kotlinx.android.synthetic.main.layout_success_dialog.view.textMessage
import kotlinx.android.synthetic.main.layout_success_dialog.view.textTitle
import kotlinx.android.synthetic.main.layout_warning_dialog.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSuccess.setOnClickListener {

            showSuccessDialog()
        }

        buttonWarning.setOnClickListener {

            showWarningDialog()
        }

        buttonError.setOnClickListener {
            showErrorDialog()

        }
    }


    private fun showSuccessDialog() {

   var  builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
    var view= LayoutInflater.from(this).inflate(R.layout.layout_success_dialog, R.id.layoutDialogContainer as (ConstraintLayout))
   builder.setView(view)
        view.textTitle.setText(resources.getString(R.string.success_title))
        view.textMessage.setText(resources.getString(R.string.dummy_text))
        view.buttonAction.setText(resources.getString(R.string.okay))
        view.imageIcon.setImageResource(R.drawable.ic_success)

        var alertDialog=builder.create()

        view.buttonAction.setOnClickListener {
            alertDialog.dismiss()
        }
        if(alertDialog.window != null){
            alertDialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
         alertDialog.show()
    }

    private fun showWarningDialog() {

        var  builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
        var view= LayoutInflater.from(this).inflate(R.layout.layout_warning_dialog, R.id.layoutDialogContainer as (ConstraintLayout))
        builder.setView(view)
        view.textTitle.setText(resources.getString(R.string.warning_title))
        view.textMessage.setText(resources.getString(R.string.dummy_text))
        view.buttonYes.setText(resources.getString(R.string.yes))
        view.buttonNo.setText(resources.getString(R.string.no))

        view.imageIcon.setImageResource(R.drawable.ic_warning)

        var alertDialog=builder.create()

        view.buttonYes.setOnClickListener {
            alertDialog.dismiss()
        }

        view.buttonNo.setOnClickListener {
            alertDialog.dismiss()
        }

        if(alertDialog.window != null){
            alertDialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
        alertDialog.show()

    }

    private fun showErrorDialog() {


        var  builder = AlertDialog.Builder(this,R.style.AlertDialogTheme)
        var view= LayoutInflater.from(this).inflate(R.layout.layout_error_dialog, R.id.layoutDialogContainer as (ConstraintLayout))
        builder.setView(view)
        view.textTitle.setText(resources.getString(R.string.error_title))
        view.textMessage.setText(resources.getString(R.string.dummy_text))
        view.buttonAction.setText(resources.getString(R.string.okay))
        view.imageIcon.setImageResource(R.drawable.ic_error)

        var alertDialog=builder.create()

        view.buttonAction.setOnClickListener {
            alertDialog.dismiss()
        }
        if(alertDialog.window != null){
            alertDialog.window!!.setBackgroundDrawable(ColorDrawable(0))
        }
        alertDialog.show()

    }


}
