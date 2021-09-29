package com.example.messageapp.contacts.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.messageapp.R
import com.example.messageapp.contacts.model.Contacts

class ContactsAdapter(
    private val contacts: MutableList<Contacts>
) : RecyclerView.Adapter<ContactsAdapter.ContactsViewHolder>() {

    class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        return ContactsViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.contact,
                parent,
                false
            )
        )
    }

    fun addContact(contact: Contacts) {
        contacts.add(contact)
        notifyItemInserted(contacts.size - 1)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val currentContact = contacts[position]
        holder.itemView.apply {
            findViewById<TextView>(R.id.text_view_contact_name).text = currentContact.name
            findViewById<TextView>(R.id.text_view_contact_category).text = currentContact.category
            findViewById<CheckBox>(R.id.checkbox_contact_important).isChecked =
                currentContact.important
        }
    }

    override fun getItemCount(): Int {
        return contacts.size
    }
}