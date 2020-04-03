# DialogDesign
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
            //-------------------------------------------------//
            //coloca un color transparente para la ventana del dialogo
             //-------------------------------------------------//
        }
         alertDialog.show()
