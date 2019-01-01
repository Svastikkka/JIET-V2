package com.svatikk.jietuniverse;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by manshusharma on 30/06/17.
 */
public class RecyclerAdapterForContactNumbers extends RecyclerView.Adapter<RecyclerAdapterForContactNumbers.MyViewHolder>{

    ArrayList<GetterSetterForContactNumbers> arrayList =new ArrayList<>();


    Context ctx;


    RecyclerAdapterForContactNumbers(ArrayList<GetterSetterForContactNumbers> arrayList, Context ctx){

        this.arrayList= arrayList;

        this.ctx=ctx;

    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

       View view = LayoutInflater .from(parent.getContext()).inflate(R.layout.card_view_for_contact_numbers,parent,false);


        return new MyViewHolder(view,ctx);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImage_Id());
        holder.textView.setText(arrayList.get(position).getInstitutes());
        holder.textView2.setText(arrayList.get(position).getDesignation());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public  static  class MyViewHolder extends RecyclerView.ViewHolder   implements View.OnClickListener{


        ImageView imageView;
        TextView textView ,textView2;



        Context ctx;


        public MyViewHolder(View itemView ,Context ctx) {
            super(itemView);


            itemView.setOnClickListener(this);
            this.ctx = ctx;



            imageView=(ImageView)itemView.findViewById(R.id.images);
            textView = (TextView)itemView.findViewById(R.id.person_name);
            textView2 = (TextView)itemView.findViewById(R.id.designation);

        }



        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            //  Contact contact = this.contacts.get(position);




            switch (position) {

                case 0:
                    // Handle the  Contact section

                    Log.i("yoo", "Navneet Agrawal");
                    Intent contact = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829214770"));
                    ctx.startActivity(contact);


                    break;
                case 1:
                    // Handle the  Contact section

                    Log.i("yoo", "Rakesh kothari");
                    Intent contact1 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829214771"));
                    ctx.startActivity(contact1);

                    break;
                case 2:
                    // Handle the  Contact section

                    Log.i("yoo", "Utkarsh Bhandhari");
                    Intent contact2 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829214772"));
                    ctx.startActivity(contact2);


                    break;
                case 3:
                    // Handle the  Contact section

                    Log.i("yoo", "Maneet Siwach");
                    Intent contact3 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829039392"));
                    ctx.startActivity(contact3);


                    break;
                case 4:
                    // Handle the  Contact section

                    Log.i("yoo", "Nidhi Bhagrgava");
                    Intent contact4 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9928219581"));
                    ctx.startActivity(contact4);


                    break;

                case 5:
                    // Handle the  Contact section

                    Log.i("yoo", "Jitendera choudhary");
                    Intent contact5 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829044343"));
                    ctx.startActivity(contact5);


                    break;
                case 6:
                    // Handle the  Contact section

                    Log.i("yoo", "Aishwarya prabhakar");
                    Intent contact6 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829239771"));
                    ctx.startActivity(contact6);


                    break;
                case 7:
                    // Handle the  Contact section

                    Log.i("yoo", "Nishant goyal");
                    Intent contact7 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829155343"));
                    ctx.startActivity(contact7);


                    break;
                case 8:
                    // Handle the  Contact section

                    Log.i("yoo", "Samundra singh");
                    Intent contact8 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9928039077"));
                    ctx.startActivity(contact8);


                    break;
                case 9:
                    // Handle the  Contact section

                    Log.i("yoo", "rakhi goyal");
                    Intent contact9 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9928222558"));
                    ctx.startActivity(contact9);


                    break;
                case 10:
                    // Handle the  Contact section

                    Log.i("yoo", "shuresh k verma ");
                    Intent contact10 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9929094392"));
                    ctx.startActivity(contact10);


                    break;
                case 11:
                    // Handle the  Contact section

                    Log.i("yoo", "Rajendra karwa ");
                    Intent contact11 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9314218084"));
                    ctx.startActivity(contact11);


                    break;
                case 12:
                    // Handle the  Contact section

                    Log.i("yoo", "Op vyas ");
                    Intent contact12 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829215771"));
                    ctx.startActivity(contact12);


                    break;
                case 13:
                    // Handle the  Contact section

                    Log.i("yoo", " rk gupta");
                    Intent contact13 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9928594728"));
                    ctx.startActivity(contact13);


                    break;
                case 14:
                    // Handle the  Contact section

                    Log.i("yoo", " mr baid");
                    Intent contact14 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9001190022"));
                    ctx.startActivity(contact14);


                    break;
                case 15:
                    // Handle the  Contact section

                    Log.i("yoo", " mr baid");
                    Intent contact15 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9314711767"));
                    ctx.startActivity(contact15);


                    break;
                case 16:
                    // Handle the  Contact section

                    Log.i("yoo", " Arvind rai");
                    Intent contact16 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9950011440"));
                    ctx.startActivity(contact16);


                    break;
                case 17:
                    // Handle the  Contact section

                    Log.i("yoo", " hemant purohit");
                    Intent contact17 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9413573322"));
                    ctx.startActivity(contact17);


                    break;
                case 18:
                    // Handle the  Contact section

                    Log.i("yoo", " mamta garg");
                    Intent contact18 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9462500480"));
                    ctx.startActivity(contact18);


                    break;
                case 19:
                    // Handle the  Contact section

                    Log.i("yoo", " kusam agrawal");
                    Intent contact19 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829631363"));
                    ctx.startActivity(contact19);


                    break;
                case 20:
                    // Handle the  Contact section

                    Log.i("yoo", " Pankaj Acharya");
                    Intent contact20 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:8890183972"));
                    ctx.startActivity(contact20);


                    break;
                case 21:
                    // Handle the  Contact section

                    Log.i("yoo", " punita soni");
                    Intent contact21 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9929605598"));
                    ctx.startActivity(contact21);


                    break;
                case 22:
                    // Handle the  Contact section

                    Log.i("yoo", " manish bafna");
                    Intent contact22 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9414260613"));
                    ctx.startActivity(contact22);


                    break;
                case 23:
                    // Handle the  Contact section

                    Log.i("yoo", "am khan");
                    Intent contact23 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829118518"));
                    ctx.startActivity(contact23);


                    break;
                case 24:
                    // Handle the  Contact section

                    Log.i("yoo", "sandeep mathur");
                    Intent contact24 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9414477945"));
                    ctx.startActivity(contact24);


                    break;
                case 25:
                    // Handle the  Contact section

                    Log.i("yoo", "ashwani  mathur ");
                    Intent contact25 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829214777"));
                    ctx.startActivity(contact25);


                    break;
                case 26:
                    // Handle the  Contact section

                    Log.i("yoo", "gajendra singh ");
                    Intent contact26 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("tel:9829214774"));
                    ctx.startActivity(contact26);


                    break;

                default:Log.i("ERROR","OCCURS");
            }

        }

    }



    }
