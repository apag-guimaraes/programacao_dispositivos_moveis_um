public class Tela1 extends Fragment {

   private EditText editText;

   private Button button;

   private TextView textView;


  @Override

public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

   //return super.onCreateView(inflater, container, savedInstanceState);

   View view = inflater.inflate(R.layout.tela1,container,false);  //o layout criado é passado no argumento do método para inflar a view. O layout serve para mostrar a posição dos elementos.

   editText = view.findViewById(R.id.editTextNome);

   button = view.findViewById(R.id.buttonNome);

   textView = view.findViewById(R.id.textViewNome);


   button.setOnClickListener(new View.OnClickListener() {

       @Override

       public void onClick(View view) {

           textView.setText(editText.getText().toString());

       }

   });


   return view;

}

}
