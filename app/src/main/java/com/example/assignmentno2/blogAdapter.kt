import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentno2.R
import com.example.assignmentno2.model_class
import com.bumptech.glide.Glide
import com.example.assignmentno2.DescriptionActivity

class BlogAdapter(
    private val blogList: List<model_class>
) : RecyclerView.Adapter<BlogAdapter.BlogViewHolder>() {


    data class BlogViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imgUrl:ImageView = view.findViewById(R.id.imageView)
        val blogTitle:TextView = view.findViewById(R.id.textView)
        val blogTime:TextView = view.findViewById(R.id.textView2)
        val shortDescription:TextView = view.findViewById(R.id.textView3)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.blog_view, parent, false)
        return BlogViewHolder(view)
    }

    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
        val item = blogList[position]

        holder.apply {
            Glide.with(view.context)
                .load(item.imgUrl)
                .placeholder(R.drawable.health)
                .error(R.drawable.health)
                .into(imgUrl)

            blogTitle.text = item.blogTitle
            blogTime.text = item.blogUploadDate
            shortDescription.text = item.blogShortDescription

            // Set onClickListener to pass data to Description Activity
            view.setOnClickListener {
                val context = view.context
                val intent = Intent(context, DescriptionActivity::class.java)

                // Pass data to Description Activity using Intent extras
                intent.putExtra("imageUrl", item.imgUrl)
                intent.putExtra("headline", item.blogTitle)
                intent.putExtra("time", item.blogUploadDate)
                intent.putExtra("description", item.blogDescription)

                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount() = blogList.size
}
