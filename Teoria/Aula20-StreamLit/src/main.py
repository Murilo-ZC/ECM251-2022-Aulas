from cProfile import label
from turtle import onclick
import streamlit as st

main, info, cadastro = st.tabs(["Home", "Info", "Cadastro"])

with main:
    st.title("Ola Mundo StreamLit👻😘")
    st.write("Obrigado Ubiratan!")
    st.markdown("## Subtítulo de **Seção**:")
    st.code(
        """
        def somar(a,b):
            return a+b
    val1 = 10
    val2 = 12
    print(somar(val1,val2))
        """,
        language='python'
    )
    st.code(
        """
        python -m streamlit run arquivo.py
        """,
        language='bash'
    )

    st.metric(
        label="Total da Compra (R$):",
        value=105.92
    )

def fui_apertado():
    print("Ola Mundo!")

def somar_dois(v1,v2):
    resultado = v1+v2
    st.session_state["kratos"] = resultado

with info:
    numero1 = st.number_input(
        label="Valor 1:",
        min_value= 0,
        max_value = 100
    )
    numero2 = st.number_input(
        label="Valor 2:",
        min_value= 0,
        max_value = 100
    )

    st.button(
        label="Clicar aqui🍳",
        help="Clique para ver comida!",
        on_click=somar_dois,
        kwargs={"v1":numero1, "v2":numero2}
    )

    if "kratos" in st.session_state:
        st.metric(
                label="Resultado:",
                value=st.session_state["kratos"]
        )
    else:
        st.write("Ainda nenhum calculo foi realizado!")

    option = st.selectbox(
        'How would you like to be contacted?',
        ('Email', 'Home phone', 'Mobile phone'))

    st.write('You selected:', option)

with cadastro:
    col1, col2, col3 = st.columns(3)

    with col1:
        st.image(
            "https://assets.reedpopcdn.com/Scarlet_Violet_Key_Art.jpg/BROK/thumbnail/1200x1200/quality/100/Scarlet_Violet_Key_Art.jpg",
            caption="Imagem polêmica de pokemon"
        )


    with col2:
        st.image(
            image="assets/lechonk.jpg",
            caption="Lechonk"
        )

    with col3:
        st.image(   
            image="assets/professor_oak.jpg",
            caption="Professor Oak"
        )

st.sidebar.title("Navegação")