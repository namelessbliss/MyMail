package com.app.nb.mymail.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.nb.mymail.R;
import com.app.nb.mymail.models.Mail;

import java.util.List;

public class MailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Mail> list;
    private final int SUBJECT_MAX_LENGHT = 40;
    private final int MESSAGE_MAX_LENGHT = 80;

    public MailAdapter(Context context, int layout, List<Mail> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, null);
            holder = new ViewHolder();
            holder.subject = convertView.findViewById(R.id.tvListSubject);
            holder.message = convertView.findViewById(R.id.tvListMessage);
            holder.sender = convertView.findViewById(R.id.tvListSenderName);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Mail mail = (Mail) getItem(position);


        //Si el titulo del correo  es mas largo de 40 caracteres cortamos y añadimos puntos suspensivos al final
        String shortSubject;
        if (mail.getSubject().length() > SUBJECT_MAX_LENGHT) {
            shortSubject = mail.getSubject().substring(0, SUBJECT_MAX_LENGHT) + "...";
        } else {
            shortSubject = mail.getSubject();
        }
        holder.subject.setText(shortSubject);

        // Si el mensaje del correo es mas largo de 80 caracteres
        String shortMessage;
        if (mail.getMessage().length() > MESSAGE_MAX_LENGHT) {
            shortMessage = mail.getMessage().substring(0, MESSAGE_MAX_LENGHT) + "...";
        } else {
            shortMessage = mail.getMessage();
        }
        holder.message.setText(shortMessage);

        //cogemos la primera letra del correo
        holder.sender.setText(mail.getSenderName().substring(0, 1));
        // Obtenemos el backgroud y le damos color con el random color
        holder.sender.getBackground().setColorFilter(Color.parseColor(mail.getColor()), PorterDuff.Mode.SRC);

        return convertView;
    }

    static class ViewHolder {
        private TextView subject;
        private TextView message;
        private TextView sender;
    }
}

