

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.miwok_workshop.MiwokModel;
import com.example.miwok_workshop.R;

import java.util.List;


public class MiwokAdapter extends RecyclerView.Adapter<MiwokAdapter.MiwokViewHolder> {
    private Context context;
    private List<MiwokModel> miwokModelList;
    private int colorResId;


    public MiwokAdapter(Context context, List<MiwokModel> list, int colorResId) {

        this.context = context;
        this.miwokModelList = list;
        this.colorResId = colorResId;
    }

    @NonNull
    @Override
    public MiwokViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        MiwokViewHolder miwokViewHolder = new MiwokViewHolder(view);
        return miwokViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MiwokViewHolder holder, int position) {
        holder.miwokWord.setText(miwokModelList.get(position).getMiwokWord());
        holder.translatedWord.setText(miwokModelList.get(position).getMiwokTranslation());
        if (miwokModelList.get(position).hasImage()) {
            holder.image.setImageResource(miwokModelList.get(position).getImageResId());
            holder.image.setVisibility(View.GONE);
        }else {
            holder.image.setVisibility(View.GONE);
        }
        int color = ContextCompat.getColor(context, colorResId);
        holder.textContainer.setBackgroundColor(color);
    }


    @Override
    public int getItemCount() {return miwokModelList.size();}

    class MiwokViewHolder extends RecyclerView.ViewHolder{

        TextView miwokWord, translatedWord;
        ImageView image;
        View textContainer;


        public MiwokViewHolder(@NonNull View itemView) {
            super(itemView);
            miwokWord = itemView.findViewById(R.id.tv1);
            translatedWord = itemView.findViewById(R.id.tv2);
            image = itemView.findViewById(R.id.image);
            textContainer = itemView.findViewById(R.id.text_container);


        }
    }
}
