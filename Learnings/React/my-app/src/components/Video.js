import './Video.css'

function Video({ title, bgColor }) {
    let bg = "dark"
    return (
        <>
            <h1>{title} tutorial</h1>
            <img
                src="https://picsum.photos/500"
                alt="Hedy Lamarr"
                className="photo" />
            <div className={bg} style={{ backgroundColor: bgColor }}>This is the sample text</div >
        </>
    )
}

function Audio() {
    return <div className="">Audio</div>
}

// export default Video;
export { Video, Audio }